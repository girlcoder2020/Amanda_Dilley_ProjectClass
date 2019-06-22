
public class ProjectTest {

	public static void main(String[] args) {
		Project p= new Project();
		
		p.setName("Norma Jean");
		p.setDescription(" is a midwife.");
				
		String elevatorPitch = p.getName() + ":" + p.getDescription();
		System.out.println(elevatorPitch);
	}

}
