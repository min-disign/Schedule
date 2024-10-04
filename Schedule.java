import java.time.LocalDateTime;


public class Schedule {

    private Object GenerationType;


    private Long id;  // 고유 식별자

    private String task;  // 할일
    private String author;  // 작성자명
    private String password;  // 비밀번호 (암호화 가능)

    private LocalDateTime createdAt;  // 작성일
    private LocalDateTime updatedAt;  // 수정일

    // 생성자, getter/setter
    public Schedule() {}

    // Getters and Setters omitted for brevity
}
