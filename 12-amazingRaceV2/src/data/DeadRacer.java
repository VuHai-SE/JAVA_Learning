/*
        Nếu như đua mà bạn chỉ quan tâm tới đua mà không quan tâm đến việc an toàn thì rõ ràng là một đua thủ, một 
    anh hùng xa lộ, một dead racer chính hiệu, thì m phải đua đến chết.
        Mình tham gia clb từ tứ phương 9 hướng, có chung một sở thích, một team, có chỉ cần có chung một sở thích, không cần 
    có một diểm chung nào cả. Interface là mọt hội nhóm đi chung một mục đích không phân biệt đặc điểm riêng => trong interface 
    không chứa properties
        Nhưng nếu cố tình chứa đặc điểm thì java sẽ ép bạn phải đưa đặc điểm này thành static final.
 */
package data;

public interface DeadRacer {
    String DEADRACEDATE = "ngày đua cũng là ngày giỗ"; 
        // tự hiểu là public final (hằng số)
        // Interface không có constructor
        //=>không tạo được object
    
        //Các method trong interface đều là abstract vì vậy lúc khởi tạo không cần có từ khoá abstract nó vẫn hiểu
    public double runToDead();
    public void showToQuocGhiCong();
}
