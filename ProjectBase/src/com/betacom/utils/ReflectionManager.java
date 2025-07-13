package com.betacom.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import com.betacom.exception.AcademyException;


public class ReflectionManager {
	
	private static final String PACKAGE_NAME = "com.betacom.car.process";
	public Object executeMethod(Object myClass, String methodName, Object[] params) throws AcademyException{
		try {
			Method methodToExecute = Arrays.stream(myClass.getClass().getMethods())
					.filter(m -> methodName.equalsIgnoreCase(m.getName()))
					.findFirst()
					.orElseThrow(() -> new AcademyException("Method not gìfound: " + methodName));
			return methodToExecute.invoke(myClass, params);
		} catch (SecurityException e) {
			throw new AcademyException("Security Exception: " + e.getMessage());
		}catch (IllegalAccessException e) {
			throw new AcademyException("Illegal Access Exception: " + e.getMessage());
		}catch (InvocationTargetException e) {
			throw new AcademyException("Invocation Target Exception: " + e.getMessage());
		}
	}
	
	
	
//	public void invokeExecute(String[] param  ) throws AcademyException{
//		try {
//			String methodName = "execute";
//			String tVeicolo = param[StartCar.TIPO_VEICOLO].substring(0, 1).toUpperCase() + param[StartCar.TIPO_VEICOLO].substring(1).toLowerCase(); 			
//			String className = "Process" + tVeicolo;
//			Class<?> cl = Class.forName(PACKAGE_NAME + "." + className);
//			Constructor<?> ctor = cl.getConstructor();
//			
//			Object myClass = ctor.newInstance();  // new instance della class
//			Method executeMethod = myClass.getClass().getMethod(methodName,String[].class);
//			
//			executeMethod.invoke(myClass,(Object) param);
//			
//		} catch (ClassNotFoundException e) {
//			throw new AcademyException("tipo veicolo not found :" + param[StartCar.TIPO_VEICOLO]);
//		} catch (NoSuchMethodException e) {
//			throw new AcademyException("error sul contructore.." + e.getMessage());
//		} catch (SecurityException e) {
//			throw new AcademyException("error di sicurezza.." + e.getMessage());
//		} catch (InstantiationException e) {
//			throw new AcademyException("Errore nel costructore.." + e.getMessage());
//		} catch (IllegalAccessException e) {
//			throw new AcademyException("Errore IllegalAccess" + e.getMessage());
//		} catch (IllegalArgumentException e) {
//			throw new AcademyException("Errore IllegalArgument" + e.getMessage());
//		} catch (InvocationTargetException e) {            // retrieve error from invoke method (AcademyException)
//			throw new AcademyException(e.getCause().getMessage());
//		}
//
//		
//		
//		
//	}
	
}