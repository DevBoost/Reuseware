package org.reuseware.lib.systems.exchange.lib; 

public interface IConsumer<VT, AT> { 
	void consume (AT agent, VT value) ; 
} 
