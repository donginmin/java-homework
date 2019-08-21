package homework04_member;
import javax.swing.JOptionPane;
public class MemberController {
	
	public static void main(String[] args) {
		Member member = null;
		MemberService memberService = new MemberService();
		
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 1.Join 2.마이페이지 3.Bmi 4.ReportCard 5.Tax")) {
			case "0" : System.out.println("종료"); return;
			case "1": 
				member= new Member();
				
				member.setName(JOptionPane.showInputDialog("이름입력"));
				member.setId(JOptionPane.showInputDialog("ID입력"));
				member.setPassword(JOptionPane.showInputDialog("비밀번호 입력"));
				String tall=JOptionPane.showInputDialog("키 입력");
                member.setTall(Double.parseDouble(tall));
    			String weight=JOptionPane.showInputDialog("몸무게 입력");
                member.setWeight(Double.parseDouble(weight));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				member.setBlood(JOptionPane.showInputDialog("혈액형"));
    			String salary=JOptionPane.showInputDialog("연봉");
                member.setSalary(Integer.parseInt(salary));
                String kor=JOptionPane.showInputDialog("국어점수 입력");
                member.setKor(Integer.parseInt(kor));
                String eng=JOptionPane.showInputDialog("영어점수 입력");
                member.setEng(Integer.parseInt(eng));
                String math=JOptionPane.showInputDialog("수학점수 입력");
                member.setMath(Integer.parseInt(math));
                
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "2.마이페이지\n"+member.toString());
				break;
				
			case "3":
				JOptionPane.showMessageDialog(null,memberService.getBmi2(member));
				
				break;
				
			case "4":
				JOptionPane.showMessageDialog(null, memberService.getReportCard2(member));
			break;
			case "5":
				JOptionPane.showMessageDialog(null, memberService.getTax2(member));
			break;
			
			
			
			}

		}

	}
}
