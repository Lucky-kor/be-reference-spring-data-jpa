# Spring Data JPA 레퍼런스 코드

### Description
Spring Data JPA 레퍼런스 코드는 학습 컨텐츠에서 사용되는 예제 코드 + 라이브 세션에서 사용되는 예제 코드로 구성이 되어 있습니다.
* 학습 컨텐츠용 예제 코드 
  * 엔티티 클래스의 연관관계 매핑 예제 코드 
  * Spring Data JPA를 통한 데이터 액세스 계층 구현 예제 코드
* 라이브 세션용 예제 코드
  * [Mapstruct에서의 enum 매핑 예제 코드](#mapstruct에서의-enum-매핑-예제-코드)
  * [Value Object를 타입으로 사용하기 위한 예제 코드](#value-object를-타입으로-사용하기-위한-예제-코드)
  
> 예제 코드에 대한 더 구체적인 정보는 아래에서 확인하세요.

---

### Mapstruct에서의 enum 매핑 예제 코드
Mapstruct에서 enum 타입을 매핑하기 위한 예제 코드입니다.
* 소스 코드 경로
  * DTO
    * [src/main/java/com/springboot/member/dto/MemberResponseDto](https://github.com/codestates-seb/be-reference-spring-data-jpa/blob/8a09d6d2fa79eb124e49d6a4ba8fdc69d3f0953a/src/main/java/com/codestates/member/dto/MemberResponseDto.java)
  * Mapper
    * [src/main/java/com/springboot/member/mapper/MemberMapper](https://github.com/codestates-seb/be-reference-spring-data-jpa/blob/8a09d6d2fa79eb124e49d6a4ba8fdc69d3f0953a/src/main/java/com/codestates/member/mapper/MemberMapper.java)
---

### Value Object를 타입으로 사용하기 위한 예제 코드
Spring Data JPA에서 Value Object를 데이터 타입으로 사용하기 위해 @Embeddable / @Embedded 애너테이션을 사용할 수 있습니다.
* Money 타입 Value Object
  * [src/main/java/com/springboot/values](https://github.com/codestates-seb/be-reference-spring-data-jpa/tree/main/src/main/java/com/codestates/values)
* Entity
  * [src/main/java/com/springboot/coffee/entity](https://github.com/codestates-seb/be-reference-spring-data-jpa/tree/main/src/main/java/com/codestates/coffee/entity)
* Mapper
  * [src/main/java/com/springboot/coffee/mapper](https://github.com/codestates-seb/be-reference-spring-data-jpa/tree/main/src/main/java/com/codestates/coffee/mapper)
