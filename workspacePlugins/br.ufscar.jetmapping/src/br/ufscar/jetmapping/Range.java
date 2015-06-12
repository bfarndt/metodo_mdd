package br.ufscar.jetmapping;

public class Range {
	private int from;
	private int to;

	public Range(int from, int to) {
		this.from = from;
		this.to = to;
	}

	public boolean isContiguous(Range other) {
		return (this.to == other.from);
	}

	public void merge(Range other) {
		this.to = other.to;
	}

	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

	public void setFrom(int newFrom) {
		this.from = newFrom;
	}

	public void setTo(int newTo) {
		this.to = newTo;
	}

	public void increaseRange(int length) {
		this.to += length;
	}

	public boolean contains(int offset, RetrievalPolicy policy) {
		if (policy == RetrievalPolicy.LeftExclusiveRightInclusive) {
			return offset > from && offset <= to;
		} else {
			return offset >= from && offset < to;
		}
	}

	public String toString() {
		return from + "," + to;
	}

	public static Range parseRange(String str) {
		int i = str.indexOf(",");
		String strFrom = str.substring(0, i);
		String strTo = str.substring(i + 1);
		return new Range(Integer.parseInt(strFrom), Integer.parseInt(strTo));
	}

	public boolean isAfter(int offset, RetrievalPolicy policy) {
		if (policy == RetrievalPolicy.LeftExclusiveRightInclusive) {
			return from >= offset;
		} else {
			return from > offset;
		}
	}

	public void translateRange(int length) {
		from += length;
		to += length;
	}

	public Range createCopy() {
		return new Range(from, to);
	}

	public boolean hasZeroLength() {
		return from == to;
	}

	public int size() {
		return to - from;
	}
}
