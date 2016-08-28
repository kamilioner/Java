package magazyn;

public class Computer {
	protected String producer;
	protected int model;
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public String getProducer() {
		return producer;
	}
	
	public void setModel(int model) {
		this.model = model;
	}

	public int getModel() {
		return model;
	}
	
    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }
	
	@Override
	public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Computer))
            return false;
        Computer comp = (Computer) obj;
        if(producer != null)
            if(producer.equals(comp.getProducer()) && comp.getModel() == this.model)
                return true;
        return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getProducer()+" model: "+getModel();
	}
}
