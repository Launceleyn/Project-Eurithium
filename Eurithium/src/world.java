public class world {
	char[][] fieldView = new char[38][24];
	
	public world() {
		for (int row = 0; row < 38; row ++)
			for (int col = 0; col < 24; col++)
				fieldView[row][col] = 'i';
		
		
	}
	/*
	public void generateView()
	{
		for(int i = 0; i < 40; i++)
		{
			for (int j = 0; j < 24; j++)
			{
				this.fieldView[i][j] = 'i';
			}
		}
	}*/
	
	public void generateMap()
	{
		//Do things here.
	}
	
	public char getVis(int i, int j)
	{
		return fieldView[i][j];
	}
	
	
}
