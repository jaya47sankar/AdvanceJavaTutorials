package jss.day2.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Builder
@Getter
@ToString
public class User {
	
	private int id;
	private String name;
	private String phone;
	private String address;
	

}
