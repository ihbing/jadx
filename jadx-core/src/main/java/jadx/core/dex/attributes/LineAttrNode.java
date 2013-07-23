package jadx.core.dex.attributes;

public abstract class LineAttrNode extends AttrNode {

	private int sourceLine;

	private int decompiledLine;

	public int getSourceLine() {
		return sourceLine;
	}

	public void setSourceLine(int sourceLine) {
		this.sourceLine = sourceLine;
	}

	public int getDecompiledLine() {
		return decompiledLine;
	}

	public void setDecompiledLine(int decompiledLine) {
		this.decompiledLine = decompiledLine;
	}
}