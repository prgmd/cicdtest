package dockerspringboot.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public int sum(int a, int b){
		return a+b;
	}
}