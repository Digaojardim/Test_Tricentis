package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browsers {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("--------- erro ao abrir navegador --------" + e.getMessage());
			System.err.println("--------- causa do erro --------" + e.getCause());
		}
	}

	public void escrever(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}

	public void submit(By element) {
		driver.findElement(element).submit();
	}

	public void clear(By element) {
		driver.findElement(element).clear();
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void evidencia(String nomeEvidencia) {

		TakesScreenshot scrShot = (TakesScreenshot) driver;

		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");

		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fecharNavegador() {
		driver.quit();
	}

}
