package commands.advancedCommands;

import backend.Interpreter;
import backend.Turtle;
import commands.AdvancedCommand;
import exceptions.InvalidCommandException;
import exceptions.InvalidCommandStringException;
import exceptions.InvalidSyntaxException;
import exceptions.InvalidWordException;
import exceptions.NotEnoughParametersException;

public class IfAdvancedCommand extends AdvancedCommand {

	public IfAdvancedCommand() {
		super(1);
	}

	@Override
	public double execute(Object o) throws InvalidSyntaxException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException, InvalidCommandStringException,
			InvalidWordException, NotEnoughParametersException,
			InvalidCommandException {
		Interpreter interpreter = (Interpreter) o;
		interpreter.engine.saveTurtleState();
		
		Double ret = interpreter.readBrackets();
		
		if (parameters.get(0) == 0) {
			interpreter.engine.restoreTurtleState();
		}
		return ret;
	}

}
