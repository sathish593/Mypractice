/**
 * 
 */
package com.example.Java8;

/**
 * @author UyyalaSK
 *
 */
public class StaffPublic {
	 @Override
	public String toString() {
		return "StaffPublic [name=" + name + ", age=" + age + ", extra=" + extra + "]";
	}
	private String name;
	    private int age;
	    private String extra;
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}
		/**
		 * @return the extra
		 */
		public String getExtra() {
			return extra;
		}
		/**
		 * @param extra the extra to set
		 */
		public void setExtra(String extra) {
			this.extra = extra;
		}
	    
}
