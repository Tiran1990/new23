/** jhkgjhjhjhjhjhhjh
 * @author classroom
 *
 */
public class SharedData 
{
	/** jhkbjkjkbkjkkjk */
	private int [] array; //
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** dhdhhd
	 * @param array ......
	 * @param b .............
	 */
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/** cfhfdhd
	 * @return nj....
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public int[] getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
