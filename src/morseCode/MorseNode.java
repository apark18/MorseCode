package morseCode;

public class MorseNode {
	char value;
	MorseNode dot;
	MorseNode dash;
	public MorseNode(char value){
		this.value = value;
	}
	
	public char getValue(){
		return value;
	}
	public void setDash(MorseNode dash){
		this.dash = dash;
	}
	public void setDot(MorseNode dot){
		this.dot = dot;
	}
	public MorseNode getDash(){
		return dash;
	}
	public MorseNode getDot(){
		return dot;
	}
}
