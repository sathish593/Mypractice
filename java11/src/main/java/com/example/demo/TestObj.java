package com.example.demo;

public class TestObj {

    String name;
    String msg;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public TestObj(String name, String msg) {
	super();
	this.name = name;
	this.msg = msg;
    }
    @Override
    public String toString() {
	return "TestObj [name=" + name + ", msg=" + msg + "]";
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((msg == null) ? 0 : msg.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	TestObj other = (TestObj) obj;
	if (msg == null) {
	    if (other.msg != null)
		return false;
	} else if (!msg.equals(other.msg))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }
    

}
