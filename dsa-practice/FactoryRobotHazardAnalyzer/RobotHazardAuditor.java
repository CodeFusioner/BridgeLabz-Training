package FactoryRobotHazardAnalyzer;

import java.util.List;
import java.util.Scanner;

public class RobotHazardAuditor {

    List<String> machine = List.of("Worn", "Faulty", "Critical");

    public double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException{
        if(armPrecision < 0.0 || armPrecision > 1.0){
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0.");
        }
        if(workerDensity < 1 || workerDensity > 20){
            throw new RobotSafetyException("Error:Worker density must be 1-20.");
        }
        if(!machine.contains(machineryState)){
            throw  new RobotSafetyException("Error: Unsupported machinery state.");
        }
        double hazardRisk = 0;
        switch (machineryState){
            case "Worn":
                hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 1.3);
                break;

            case "Faulty":
                hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 2.0);
                break;

            case "Critical":
                hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 3.0);
                break;

            default:
                System.out.println("Invalid Machine State");
                break;
        }
        return hazardRisk;
    }

    public static void main(String[] args) {

        RobotHazardAuditor robotHazardAuditor = new RobotHazardAuditor();

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter Arm Precision (0.0 - 1.0): ");
            double armPrecision = sc.nextDouble();

            System.out.print("Enter Worker Density (1 - 20): ");
            int workerDensity = sc.nextInt();

            System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
            String machineryState = sc.next();

            double hazardScore = robotHazardAuditor.calculateHazardRisk(armPrecision, workerDensity, machineryState);
            System.out.println(hazardScore);

        }catch (RobotSafetyException e){
            System.out.println(e.getMessage());
        }
    }
}
