package core.actions;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class CommonActions {
	public final static String IMAGE_UPLOAD_PAGE = "/popups/imageUploaded.jsp";

	public String showSessionImage(HttpServletRequest req,
			HttpServletResponse resp) {
		String imageId = req.getParameter("imageId");
		String imageContentType = (String) req.getSession().getAttribute(
				imageId + "ContentType");

		byte[] image = (byte[]) req.getSession().getAttribute(imageId);
		if (imageContentType != null) {
			resp.setContentType(imageContentType);
			try {
				ServletOutputStream os = resp.getOutputStream();
				os.write(image);
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public String uploadImage(HttpServletRequest req, HttpServletResponse resp) {
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List<FileItem> items;
		try {
			items = (List<FileItem>) upload.parseRequest(req);

			String imageId = null;
			for (FileItem fi : items) {
				if (fi.isFormField() && fi.getFieldName().equals("imageId")) {
					imageId = fi.getString();
				}
			}

			for (FileItem fi : items) {
				if (!fi.isFormField()) {
					byte[] data = fi.get();
					req.getSession().setAttribute(imageId + "ContentType",
							fi.getContentType());
					req.getSession().setAttribute(imageId, data);
				}
			}
			req.setAttribute("imageUploaded", imageId);
			req.setAttribute("message", "image.upload.ok");

		} catch (FileUploadException e) {
			req.setAttribute("message", "image.upload.failed");
			e.printStackTrace();
		}

		return IMAGE_UPLOAD_PAGE;
	}
}
