package edu.kh.jsp2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok.jar 라이브러리 이용 방법
// 1) lombok 기능을 이용하고자 하는 프로젝트의 lib 폴더에 lombok.jar 추가하기
// 2) lombok 이용하는 IDE에 설치해주기 


// @Data // Getter + Setter + toString
//
//@Getter
//@Setter
//@ToString   ->  이런식으로 따로따로도 가능


@AllArgsConstructor // 모든 필드 초기화용 매개변수 생성자
@NoArgsConstructor  // 매개변수가 없는 -> 기본생성자
@Data
public class Book {
	//필드
	private String title;
	private String writer;
	private int price;
	
	//메서드(생성자,getter/setter,toString) ->lombok으로 쉽게 가능
	
	
}
