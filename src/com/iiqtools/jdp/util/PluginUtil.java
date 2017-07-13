package com.iiqtools.jdp.util;

import java.util.Collections;
import java.util.Iterator;

/**
 * <p>
 * This class provides static methods and fields only
 * </p>
 * 
 * @author Serge Voina
 */
public class PluginUtil {
	public static boolean isNullOrEmpty(String str) {
		return (str == null) || (str.length() == 0);
	}

	public static boolean isNotNullOrEmpty(String str) {
		return !isNullOrEmpty(str);
	}

	public static <T> Iterable<T> safeIterable(Iterable<T> iterable) {
		if (iterable == null) {
			iterable = Collections.emptyList();
		}
		return iterable;
	}

	public static <T> Iterator<T> safeIterator(Iterator<T> iterator) {
		if (iterator == null) {
			iterator = Collections.emptyIterator();
		}
		return iterator;
	}

	public static String shiftLeft(String source) {
		// DOS uses carriage return and line feed ("\r\n") as a line ending,
		// which Unix uses just line feed ("\n").

		// myString.replaceAll("[ \t]+(\r\n?|\n)", "$1");

		String regex = "(\n|\r\n)\t";

		if (source != null && source.length() > 0) {
			source = source.replaceAll(regex, "$1");

			if ((source.length() > 0) && (source.charAt(0) == '\t')) {
				source = source.substring(1);
			}
		}
		return source;
	}

	public static boolean areEqual(String s1, String s2) {
		if (s1 != null) {
			return s1.equals(s2);
		}
		return (s2 == null);
	}

	public static boolean areNotEqual(String s1, String s2) {
		return !areEqual(s1, s2);
	}
}