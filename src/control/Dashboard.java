package control;

import java.util.List;

import model.Action;
import model.DatabaseManager;

public class Dashboard {
    
    private int totalActions;
    private int ongoingActions;
    private int notStarted;
    private int delayed;
    private int completed;

    private int noUrgency;
    private int littleUrgent;
    private int veryUrgent;
    private int extremelyUrgent;

    private double totalCost;

    public Dashboard(){

        calculateMetrics();
    }

    private void calculateMetrics() {

        int[] statusCount = new int[4]; // Cria um array para armazenar as contagens
        int[] urgencyCount = new int[4];
        List<Action> actions = DatabaseManager.getAllActions();         

        totalCost = actions.stream().mapToDouble(Action::getBudget).sum();
        totalActions = actions.size();

		for (Action a : actions) {

			int currentStatus = a.getStatus();
			statusCount[currentStatus]++; // Incrementa a contagem para o status atual
		}
        notStarted = statusCount[0];//Não iniciado
        ongoingActions = statusCount[1];//iniciado
        delayed = statusCount[2];//concluido
        completed = statusCount[3];//atrasado

        for (Action a: actions){

            int currrentUrgency = a.getUrgency();
            urgencyCount[currrentUrgency]++;
        }

        noUrgency = urgencyCount[0];
        littleUrgent = urgencyCount[1];
        veryUrgent = urgencyCount[2];
        extremelyUrgent = urgencyCount[3];
    }

    public int getTotalActions() {return totalActions;}
    
    public double getTotalCost() {return totalCost;}

    public int getongoingActions() {return ongoingActions;}

    public int getnotStarted() {return notStarted;}

    public int getDelayed() {return delayed;}

    public int getCompleted() {return completed;}


    public int getNoUrgency() {return noUrgency;}

    public int getLittleUrgent() {return littleUrgent;}

    public int getVeryUrgent() {return veryUrgent;}

    public int getExtremelyUrgent() {return extremelyUrgent;}

}
