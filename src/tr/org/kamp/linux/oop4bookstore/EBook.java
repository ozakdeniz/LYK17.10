package tr.org.kamp.linux.oop4bookstore;


public class EBook extends Book {

	protected double fileSize;
	protected String encodingFormat;
	protected int numOfDevicesBeingUsed;

	public EBook(String name, String author, String bookId, double price, double fileSize, String encodingFormat,
			int numOfDevicesBeingUsed) {
		super(name, author, bookId, price);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
		this.numOfDevicesBeingUsed = numOfDevicesBeingUsed;
	}
	
	public void addDevice() {
		numOfDevicesBeingUsed = numOfDevicesBeingUsed + 1;
	}
	
	public void removeDevice() {
		numOfDevicesBeingUsed = numOfDevicesBeingUsed - 1;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public int getNumOfDevicesBeingUsed() {
		return numOfDevicesBeingUsed;
	}

	public void setNumOfDevicesBeingUsed(int numOfDevicesBeingUsed) {
		this.numOfDevicesBeingUsed = numOfDevicesBeingUsed;
	}
	
	

}