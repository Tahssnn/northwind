package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {

	// data birden fazla veri tipi olabileceği için generik yapı olusturuyoruz. <T>

	private T data;

	// data , başarı durumu ve mesaj bilgisi geçebiliriz.
	
	public DataResult(T data, boolean success, String message) {
		super(success, message); // base'e bu bilgileri gönderir.
		this.data = data;
	}

	//data ve başarı durumu geçebiliriz.
	
	public DataResult(T data, boolean success) {
		super(success); // base'e bu bilgiyi gönderir.
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

}




