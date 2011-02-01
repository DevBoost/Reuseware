public class PLACEHOLDER { 

	protected void PLACEHOLDER() {
		{
			SLOT1 producer = new SLOT1();
			SLOT2 consumer = new SLOT2();

			TYPE_SLOT ID_SLOT =  producer.produce(GIVER);
			if (ID_SLOT == null) {
				return;
			} 
			//send value...
			else {							
				consumer.consume(TAKER, ID_SLOT);
			}
		}
		NEXT :;
	}

	private Object GIVER;
	private Object TAKER;

	public abstract class TYPE_SLOT {} 
	public abstract class SLOT1 implements org.reuseware.lib.systems.exchange.lib.IProducer {}	
	public abstract class SLOT2 implements org.reuseware.lib.systems.exchange.lib.IConsumer {}
}

