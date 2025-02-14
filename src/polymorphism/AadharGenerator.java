package polymorphism;

public class AadharGenerator {
	double panCard;
	double voterId; 
	double passport;
	
		
	// Method for only PAN card
    public void generateAadhar(double panCard) {
        this.panCard=panCard;
    }
    
    // Method for PAN card and Voter ID
   public void generateAadhar(double panCard, double voterId) {
    	this.panCard=panCard;
    	this.voterId=voterId;
    }
    
    // Method for PAN card, Voter ID, and Passport
    public void generateAadhar(double panCard, double voterId, double passport) {
    	this.panCard=panCard;
    	this.voterId=voterId;
    	this.passport=passport;
    	
    }
    
   public void getAadhar()
    {
    	System.out.print((int)(Math.random()*10000)+" ");
    	System.out.print((int)(Math.random()*10000)+" ");
    	System.out.println((int)(Math.random()*10000)+" ");
    }
    
}
