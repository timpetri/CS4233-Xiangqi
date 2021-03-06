package testutil;

import xiangqi.common.XiangqiCoordinate;

/**
 * Simple implementation of the XiangqiCoordinate interface used for testing purposes.
 * @author Tim Petri	
 * @version Feb 4, 2017
 */
public class TestCoordinate implements XiangqiCoordinate
{
	private final int rank;
	private final int file;
	
	public TestCoordinate(int rank, int file)
	{
		this.rank = rank;
		this.file = file;
	}
	
	public static XiangqiCoordinate makeCoordinate(int rank, int file)
	{
		return new TestCoordinate(rank, file);
	}
	
	@Override
	public int getRank()
	{
		return rank;
	}
	
	@Override
	public int getFile()
	{
		return file;
	}
	
	@Override
	public String toString() {
		String result = "(" + getRank() + ", " + getFile() + ")";
		return result;
	}
}