/**
 * 
 */
package com.example.Java8;

import java.math.BigDecimal;

/**
 * @author UyyalaSK
 *
 */
public class Staff {

	  private String name;
	    private int age;
	    private BigDecimal salary;
	    
		/**
		 * @param name
		 * @param age
		 * @param salary
		 */
		public Staff(String name, int age, BigDecimal salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
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
		 * @return the salary
		 */
		public BigDecimal getSalary() {
			return salary;
		}
		/**
		 * @param salary the salary to set
		 */
		public void setSalary(BigDecimal salary) {
			this.salary = salary;
		}
	    
}
