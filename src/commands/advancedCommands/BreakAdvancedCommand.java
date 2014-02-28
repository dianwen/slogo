package commands.advancedCommands;

import commands.AdvancedCommand;

import exceptions.EndOfStackException;
import exceptions.InvalidCommandException;
import exceptions.InvalidCommandStringException;
import exceptions.InvalidSyntaxException;
import exceptions.InvalidWordException;
import exceptions.NotEnoughParametersException;
import exceptions.SlogoException;

public class BreakAdvancedCommand extends AdvancedCommand {

	public BreakAdvancedCommand() {
		super(0);
	}

	@Override
	public double execute(Object o) throws InvalidSyntaxException,
	InstantiationException, IllegalAccessException,
	ClassNotFoundException, SlogoException, EndOfStackException {
		throw new EndOfStackException();
	}

}
