package;

import test.CoolClass;

/**
 * Main class.
 */
class Main {
	public static function main():Void {
		var cool:CoolClass<String> = new CoolClass<String>("hello", "world");
		doTheThing(cool);
	}

	static function doTheThing(input:CoolClass<String>):Void {
		trace(input.toString());
	}
}
