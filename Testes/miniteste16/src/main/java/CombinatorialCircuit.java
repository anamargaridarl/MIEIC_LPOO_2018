import java.util.ArrayList;
import java.util.List;

public class CombinatorialCircuit {

    List<LogicVariable> variables;

    public CombinatorialCircuit(){
        variables= new ArrayList<>();
    }

    public boolean addVariable(LogicVariable a) {

        for(LogicVariable variable: variables)
        {
            if(variable.equals(a))
                return false;
        }
        variables.add(a);
        return true;
    }

    public LogicVariable getVariableByName(String x1) {

        for(LogicVariable variable: variables)
        {
            if(variable.getName() == x1)
                return variable;
        }

        return null;

    }
}
