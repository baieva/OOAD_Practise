import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Sale {
	private List<SalesLineltem> lineltems = new ArrayList<SalesLineltem>();
	@SuppressWarnings("unused")
	private Date date = new Date();
	private boolean isComplete = false;
	private Payment payment;
	public Money getBalance() {
	return payment.getAmount().minus( getTotal() ); }
	public void becomeComplete() { isComplete = true; }
	public boolean isComplete() { return isComplete; }
	public void makeLineltem
	( ProductSpecification spec, int quantity ) {
	lineltems.add( new SalesLineltem( spec, quantity ) ); }
	public Money getTotal()
	{
		Money total = new Money();
		Iterator<SalesLineltem> i = lineltems.iterator( ) ;
		while ( i.hasNext() )
		{
			SalesLineltem sli = (SalesLineltem) i.next();
			total.add( sli.getSubtotal() );
		}
		return total; 
	}
	public void makePayment( Money cashTendered )
	{
	payment = new Payment( cashTendered ); }
}
