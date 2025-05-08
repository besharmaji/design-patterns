package design.pattern.behavioral.command;

public class CommandExample {
    public static void main(String[] args) {
        // Receivers
        Light light = new Light();
        Fan fan = new Fan();

        // Commands
        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn on light
        remote.setCommand(lightOn);
        remote.pressButton(); // Output: Light is ON

        // Turn on fan
        remote.setCommand(fanOn);
        remote.pressButton(); // Output: Fan is ON
    }
}

/*🤔 Why Use Command Pattern?
✅ Decouples sender and receiver → The invoker (like a remote) doesn't need to know the logic of the receiver (light/fan).
✅ Easy to extend → Add new commands (like ACOnCommand) without changing existing logic.
✅ Enables undo/redo functionality → Store command history and reverse actions if needed.
✅ Supports logging and queuing → You can log commands or execute them later (job queues, task schedulers).
✅ Encourages single responsibility → Each command class handles only one action.
* */
