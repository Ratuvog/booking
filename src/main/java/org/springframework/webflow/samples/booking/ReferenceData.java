package org.springframework.webflow.samples.booking;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.stereotype.Service;

@Service
public class ReferenceData {

	private List<SelectItem> bedOptions;

	private List<SelectItem> smokingOptions;

	private List<SelectItem> creditCardExpMonths;

	private List<SelectItem> creditCardExpYears;

	private List<SelectItem> pageSizeOptions;

	public List<SelectItem> getBedOptions() {
		if (bedOptions == null) {
			bedOptions = new ArrayList<SelectItem>();
			bedOptions.add(new SelectItem(new Integer(1), "Королевская кровать"));
			bedOptions.add(new SelectItem(new Integer(2), "Две двуспальных кровати"));
			bedOptions.add(new SelectItem(new Integer(3), "Три односпальных"));
		}
		return bedOptions;
	}

	public List<SelectItem> getSmokingOptions() {
		if (smokingOptions == null) {
			smokingOptions = new ArrayList<SelectItem>();
			smokingOptions.add(new SelectItem(Boolean.TRUE, "Да"));
			smokingOptions.add(new SelectItem(Boolean.FALSE, "Нет"));
		}
		return smokingOptions;
	}

	public List<SelectItem> getCreditCardExpMonths() {
		if (creditCardExpMonths == null) {
			creditCardExpMonths = new ArrayList<SelectItem>();
			creditCardExpMonths.add(new SelectItem(new Integer(1), "Янв"));
			creditCardExpMonths.add(new SelectItem(new Integer(2), "Фев"));
			creditCardExpMonths.add(new SelectItem(new Integer(3), "Март"));
			creditCardExpMonths.add(new SelectItem(new Integer(4), "Апр"));
			creditCardExpMonths.add(new SelectItem(new Integer(5), "Май"));
			creditCardExpMonths.add(new SelectItem(new Integer(6), "Июнь"));
			creditCardExpMonths.add(new SelectItem(new Integer(7), "Июль"));
			creditCardExpMonths.add(new SelectItem(new Integer(8), "Авг"));
			creditCardExpMonths.add(new SelectItem(new Integer(9), "Сен"));
			creditCardExpMonths.add(new SelectItem(new Integer(10), "Окт"));
			creditCardExpMonths.add(new SelectItem(new Integer(11), "Нояб"));
			creditCardExpMonths.add(new SelectItem(new Integer(12), "Дек"));
		}
		return creditCardExpMonths;
	}

	public List<SelectItem> getCreditCardExpYears() {
		if (creditCardExpYears == null) {
			creditCardExpYears = new ArrayList<SelectItem>();
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			creditCardExpYears.add(new SelectItem(new Integer(year), String.valueOf(year++)));
			creditCardExpYears.add(new SelectItem(new Integer(year), String.valueOf(year++)));
			creditCardExpYears.add(new SelectItem(new Integer(year), String.valueOf(year++)));
			creditCardExpYears.add(new SelectItem(new Integer(year), String.valueOf(year++)));
			creditCardExpYears.add(new SelectItem(new Integer(year), String.valueOf(year++)));	}
		return creditCardExpYears;
	}

	public List<SelectItem> getPageSizeOptions() {
		if (pageSizeOptions == null) {
			pageSizeOptions = new ArrayList<SelectItem>();
			pageSizeOptions.add(new SelectItem(new Integer(5), "5"));
			pageSizeOptions.add(new SelectItem(new Integer(10), "10"));
			pageSizeOptions.add(new SelectItem(new Integer(20), "20"));
		}
		return pageSizeOptions;
	}

}
