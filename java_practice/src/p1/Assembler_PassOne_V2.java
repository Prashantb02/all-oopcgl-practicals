package p1;
import java.io.*;
import java.util.*;
class Tuple{
	String mnemonic,m_class,opcode;
	int length;
	Tuple(){
	}
	Tuple(String s1,String s2,String s3,String s4){
		mnemonic = s1;
		m_class = s2;
		opcode = s3;
		length = Integer.parseInt(s4);
	}
}
class SymTuple{
	String symbol,address;
	int length;
	SymTuple(String s1,String s2,int i1){
		symbol = s1;
		address = s2;
		length = i1;
	}
	
}
class LitTuple{
	String literal,address;
	int length;
	LitTuple(){
    }
	LitTuple(String s1,String s2,int i2){
		literal = s1;
		address = s2;
		length = i2;
	}
}	
public class Assembler_PassOne_V2 {
	static int lc, iSymTabPtr=0,iLitTabPtr=0,iPoolTabPtr=0;
	static int poolTable[] = new int[10];
	static Map<String,Tuple> MOT;
	static Map<String,SymTuple> symtable;
	static ArrayList<LitTuple> littable;
	static PrintWriter out_pass1;
	static PrintWriter out_pass2;
	static int line_no;
static String processLTORG() {
	LitTuple litTuple;
	String intermediateStr = "";
	for(int i=poolTable[iPoolTabPtr-1];i<littable.size();i++) {
		litTuple = littable.get(i);
		litTuple.address = lc + "";
		intermediateStr += lc + "(DL,02) (C," +litTuple.literal+")\n ";
		lc++;
	}
	poolTable[iPoolTabPtr] = iLitTabPtr;
	iPoolTabPtr++;
	return intermediateStr;
}
static void Pass1() throws Exception{
	BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("src/p1/input.txt")));
	out_pass1 = new PrintWriter(new FileWriter("src/p1/output_pass1.txt"),true);
	PrintWriter out_symtable= new PrintWriter(new FileWriter("src/p1/symtable.txt"));
	PrintWriter out_littable = new PrintWriter(new FileWriter("src/p1/littable.txt"));
	out_pass1.println("Name:Prashant Bankar Roll no.22153");
	out_symtable.println("Name:Prashant Bankar Roll no.22153");
	out_littable.println("Name:Prashant Bankar Roll no.22153");
	String s;
	lc=0;
	while((s=input.readLine())!=null) {
		StringTokenizer st = new StringTokenizer(s," ",false);
		String s_arr[] = new String[st.countTokens()];
		
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
