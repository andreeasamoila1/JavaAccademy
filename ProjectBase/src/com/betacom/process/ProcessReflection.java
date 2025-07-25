package com.betacom.process;

import java.lang.reflect.Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProcessReflection {
	
	public boolean execute() {
		System.out.println("Begin ProcessReflection");

		String packageName = "com.betacom.objects";
		String className = "MyClassReflection";

		Integer selectConstrutor = 3;

		try {
			/*
			 * Search class
			 */
			Class cl = Class.forName(packageName + "." + className);
			System.out.println("Class " + packageName + "." + className + " found");

			Object myClass = null;
			/*
			 * retrieve constructors for selected class
			 */
			Constructor[] ctore = cl.getConstructors();
			Constructor selectedCtore = null;

			System.out.println("Numero di constructors trovato :" + ctore.length);
			/*
			 * introspection constructor
			 */
			for (Constructor ctor1 : ctore) {

				/*
				 * search parameters number for all constructors
				 */
				System.out.println("parameters number for constructor :" + ctor1.getParameterCount());

				if (ctor1.getParameterCount() == selectConstrutor) {
					selectedCtore = ctor1; // save selected constructor
				}
				/*
				 * Search parameters type
				 */

				Type[] type = ctor1.getGenericParameterTypes();
				for (Type t : type) {
					System.out.println("....Parameter type:" + t);
				}
			}

			/*
			 * new instance
			 */
			if (selectConstrutor == 0) {
				myClass = selectedCtore.newInstance();
				System.out.println("select contructor with 0 parameter");
			}
			if (selectConstrutor == 2) {
				myClass = selectedCtore.newInstance(10, "test numero 1");
				System.out.println("select contructor with 2 parameters");
			}
			if (selectConstrutor == 3) {
				myClass = selectedCtore.newInstance(20, "test numero 2", 45);
				System.out.println("select contructor with 3 parameters");
			}
			System.out.println("After new instance");

			/*
			 * introspection methods
			 */

			Method[] methods = myClass.getClass().getMethods();
			for (Method metodo : methods) {
				System.out.println("Method found:" + metodo.getName());
				/*
				 * Invoke metodi set
				 */
				if ("setId".equalsIgnoreCase(metodo.getName())) {
					metodo.invoke(myClass, 20);
				}

				if ("setDesc".equalsIgnoreCase(metodo.getName())) {
					metodo.invoke(myClass, "Test refelction");
				}

				if ("setP1".equalsIgnoreCase(metodo.getName())) {
					metodo.invoke(myClass, 99);
				}
			}
			/*
			 * direct access method
			 */
			String methodName = "toString";
			Method toString = myClass.getClass().getMethod(methodName);

			String msg = (String) toString.invoke(myClass);
			System.out.println(msg);

		} catch (ClassNotFoundException e1) {
			System.out.println("Class not found :" + e1.getMessage());

		} catch (InstantiationException e2) {
			System.out.println("InstantiationException :" + e2.getMessage());

		} catch (IllegalAccessException e3) {
			System.out.println("IllegalAccessException :" + e3.getMessage());

		} catch (IllegalArgumentException e4) {
			System.out.println("IllegalArgumentException :" + e4.getMessage());

		} catch (InvocationTargetException e5) {
			System.out.println("InvocationTargetException :" + e5.getMessage());

		} catch (NoSuchMethodException e6) {
			System.out.println("NoSuchMethodException :" + e6.getMessage());

		} catch (SecurityException e7) {
			// TODO Auto-generated catch block
			e7.printStackTrace();
		}

		return true;
	}
}
