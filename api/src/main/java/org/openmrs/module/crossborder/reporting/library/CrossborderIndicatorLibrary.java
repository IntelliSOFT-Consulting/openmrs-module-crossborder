package org.openmrs.module.crossborder.reporting.library;

import static org.openmrs.module.kenyacore.report.ReportUtils.map;
import static org.openmrs.module.kenyaemr.reporting.EmrReportingUtils.cohortIndicator;

import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Library of TB related indicator definitions. All indicators require parameters ${startDate} and
 * ${endDate}
 */
@Component
public class CrossborderIndicatorLibrary {
	
	@Autowired
	private CrossborderCohortLibrary crossborderCohorts;
	
	public CohortIndicator cbOtherNationalitiesAccesingFPServices() {
		return cohortIndicator("Number of other nationalities accessing FP services",
		    map(crossborderCohorts.cbOtherNationalitiesAccesingFpServices(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbOtherNationalitiesAccesingMCHServices() {
		return cohortIndicator(
		    "Number of other nationalities accessing MCH services",
		    map(crossborderCohorts.cbOtherNationalitiesAccesingMCHServices(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbOtherNationalitiesAccesingHIVServices() {
		return cohortIndicator(
		    "Number of other nationalities accessing HIV services",
		    map(crossborderCohorts.cbOtherNationalitiesAccesingHIVServices(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbOtherNationalitiesAccesingTBServices() {
		return cohortIndicator("Number of other nationalities accessing TB services",
		    map(crossborderCohorts.cbOtherNationalitiesAccesingTBServices(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbResidentOtherCounties() {
		return cohortIndicator("Number of residents of other districts/counties accessing services at the border facility",
		    map(crossborderCohorts.cbResidentOtherCounties(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTravelledOtherCountryLastThreeMonths() {
		return cohortIndicator("Number reporting travelled to another country last 3 months",
		    map(crossborderCohorts.cbTravelledOtherCountryLastThreeMonths(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTravelledOtherCountryLastSixMonths() {
		return cohortIndicator("Number reporting travelled to another country last 6 months",
		    map(crossborderCohorts.cbTravelledOtherCountryLastSixMonths(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTravelledOtherCountryLastTwelveMonths() {
		return cohortIndicator(
		    "Number reporting travelled to another country last 12 months",
		    map(crossborderCohorts.cbTravelledOtherCountryLastTwelveMonths(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbReceivedHivTestResults() {
		return cohortIndicator(
		    "TXT-HTS: # of individuals who received HIV testing services (HTS) and received their test results, disaggregated by HIV result",
		    map(crossborderCohorts.cbReceivedHivTestResults(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbInitiatedOnTreatment() {
		return cohortIndicator("TX-New:# of individuals newly initiated on Treatment",
		    map(crossborderCohorts.cbInitiatedOnTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTestedHivPositive() {
		return cohortIndicator("TX-POS: # of individuals who tested HIV positive",
		    map(crossborderCohorts.cbTestedHivPositive(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbReturnVisits() {
		return cohortIndicator("TX-SV:  who returned for second visit",
		    map(crossborderCohorts.returnVisits(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbReceivingTreatment() {
		return cohortIndicator("TX-CURR: of adults and children currently receiving ART",
		    map(crossborderCohorts.cbReceivingTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbVirallySuppressed() {
		return cohortIndicator(
		    "TX-PLVS: % of ART patients with a viral load result documented in the medical record and/or laboratory information systems (LIS) within the past 12 months with a suppressed viral load (<400 copies/ml)",
		    map(crossborderCohorts.virallySuppressed(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbRetainedOnTreatmentAfterOneMonth() {
		return cohortIndicator("% of adults and children known to be on treatment 1 months after initiation of ART",
		    map(crossborderCohorts.retainedOnTreatmentAfterOneMonth(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbRetainedOnTreatmentAfter6Months() {
		return cohortIndicator("% of adults and children known to be on treatment 6 months after initiation of ART",
		    map(crossborderCohorts.retainedOnTreatmentAfter6Months(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbRetainedOnTreatmentAfter3Months() {
		return cohortIndicator("% of adults and children known to be on treatment 3 months after initiation of ART",
		    map(crossborderCohorts.retainedOnTreatmentAfter3Months(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbRetainedOnTreatmentAfter12Months() {
		return cohortIndicator("% of adults and children known to be on treatment 12 months after initiation of ART",
		    map(crossborderCohorts.retainedOnTreatmentAfter12Months(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbWithPresumptiveTb() {
		return cohortIndicator("% of individuals with presumptive TB",
		    map(crossborderCohorts.cbWithPresumptiveTb(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbInvestigatedForTbByMicroscopy() {
		return cohortIndicator(
		    "Number investigated for TB (Disaggregataed by method - Microscopy,)",
		    map(crossborderCohorts.investigatedForTbByMicroscopy(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbInvestigatedForTbByXray() {
		return cohortIndicator(
		    "Number investigated for TB (Disaggregataed by method - ,X-ray)",
		    map(crossborderCohorts.investigatedForTbByXray(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbInvestigatedForTbByGeneXpert() {
		return cohortIndicator(
		    "Number investigated for TB (Disaggregataed by method - Gene-Xpert)",
		    map(crossborderCohorts.investigatedForTbByGeneXpert(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbInvestigatedForTbByCulture() {
		return cohortIndicator(
		    "Number investigated for TB (Disaggregataed by method -  Culture )",
		    map(crossborderCohorts.investigatedForTbByCulture(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTestingTbPostive() {
		return cohortIndicator("% of individuals Testing TB positive",
		    map(crossborderCohorts.testingTbPostive(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbWithDrugTbResistance() {
		return cohortIndicator("%  of individuals with TB drug resistance",
		    map(crossborderCohorts.withDrugTbResistance(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbInitiatedOnTbTreatment() {
		return cohortIndicator("% of individuals Initiated on TB treatment",
		    map(crossborderCohorts.cbInitiatedOnTbTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsActiveOnTbTreatmentOneMonth() {
		return cohortIndicator("% of Clients active on TB treatment 1 month",
		    map(crossborderCohorts.clientsActiveOnTbTreatmentOneMonth(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsActiveOnTbTreatmentTwoMonths() {
		return cohortIndicator("%  of Clients active on TB treatment 2 months",
		    map(crossborderCohorts.clientsActiveOnTbTreatmentTwoMonths(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsActiveOnTbTreatmentThreeMonths() {
		return cohortIndicator("% of Clients active on TB treatment 3 months",
		    map(crossborderCohorts.clientsActiveOnTbTreatmentThreeMonths(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsActiveOnTbTreatmentFourMonths() {
		return cohortIndicator("% of Clients active on TB treatment 4 months",
		    map(crossborderCohorts.clientsActiveOnTbTreatmentFourMonths(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsActiveOnTbTreatmentFiveMonths() {
		return cohortIndicator("% of Clients active on TB treatment 5 months",
		    map(crossborderCohorts.clientsActiveOnTbTreatmentFiveMonths(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsActiveOnTbTreatmentSixToTwelveMonths() {
		return cohortIndicator(
		    "% of Clients active on TB treatment 6-12 months",
		    map(crossborderCohorts.clientsActiveOnTbTreatmentSixToTwelveMonths(),
		        "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTreatmentOutComeCured() {
		return cohortIndicator("% of individuals with TreatMent OutCome Cured",
		    map(crossborderCohorts.treatmentOutComeCured(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTreatmentOutComeCompletedTreatment() {
		return cohortIndicator("% of individuals with TreatMent OutCome Completed Treatment",
		    map(crossborderCohorts.treatmentOutComeCompletedTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTreatmentOutComeTransferredOut() {
		return cohortIndicator("% of individuals with TreatMent OutCome Transferred Out",
		    map(crossborderCohorts.treatmentOutComeTransferredOut(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTreatmentOutComeTreatmentFailure() {
		return cohortIndicator("% of individuals with TreatMent OutCome Treatment Failure",
		    map(crossborderCohorts.treatmentOutComeTreatmentFailure(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTreatmentOutComeDead() {
		return cohortIndicator("% of individuals with TreatMent OutCome Dead",
		    map(crossborderCohorts.treatmentOutComeDead(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTreatmentOutComeLtfu() {
		return cohortIndicator("% of individuals with TreatMent LTFU",
		    map(crossborderCohorts.treatmentOutComeLtfu(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbCounsellingVistForFp() {
		return cohortIndicator("% of individuals for counselling visits for FP/RH as a result of USG assistance",
		    map(crossborderCohorts.counsellingVistForFp(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbRecievingFp() {
		return cohortIndicator("% of individuals receiving FP counselling services and were given any method",
		    map(crossborderCohorts.recievingFp(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTrainedInMaternalAndChildCare() {
		return cohortIndicator("% of individuals trained in maternal and child health care",
		    map(crossborderCohorts.trainedInMaternalAndChildCare(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbIndexClients() {
		return cohortIndicator("% of index clients (positives)",
		    map(crossborderCohorts.cbIndexClients(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbAgreedForContactElicitation() {
		return cohortIndicator("% of individuals agreed for contact elicitation",
		    map(crossborderCohorts.cbAgreedForContactElicitation(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbContactsElicited() {
		return cohortIndicator("%  of contacts elicited",
		    map(crossborderCohorts.cbContactsElicited(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbContactsEligible() {
		return cohortIndicator("%  of contacts eligible",
		    map(crossborderCohorts.contactsEligible(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbContactsElicitedTested() {
		return cohortIndicator("%  of contacts elicited Tested",
		    map(crossborderCohorts.contactsElicitedTested(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbContactsTestingHiv() {
		return cohortIndicator("%  of contacts testing HIV (PNS +)",
		    map(crossborderCohorts.cbContactsTestingHiv(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbPnsYield() {
		return cohortIndicator("PNS yield",
		    map(crossborderCohorts.PnsYield(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbContactsInnitatedOnTreatment() {
		return cohortIndicator("% of contacts initiated on treatment",
		    map(crossborderCohorts.contactsInnitatedOnTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsBookedForAppointment() {
		return cohortIndicator("% of clients booked for appointments",
		    map(crossborderCohorts.clientsBookedForAppointment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsWhoKeptAppointments() {
		return cohortIndicator("% of clients eho kept appointments",
		    map(crossborderCohorts.clientsWhoKeptAppointments(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsWhoMissedAppointments() {
		return cohortIndicator("% of clients who missed appointments traced",
		    map(crossborderCohorts.clientsWhoMissedAppointments(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsWhoMissedAppointmentsAndReturnedToCare() {
		return cohortIndicator(
		    "% of clients who missed appointments And returned to Care",
		    map(crossborderCohorts.clientsWhoMissedAppointmentsAndReturnedToCare(),
		        "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsWhoMissedAppointmentsAndSelfTransferred() {
		return cohortIndicator(
		    "%  of clients who missed appointments who self-transferred",
		    map(crossborderCohorts.clientsWhoMissedAppointmentsAndSelfTransferred(),
		        "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsWhoStoppedTreatment() {
		return cohortIndicator("% of clients who stopped treatment",
		    map(crossborderCohorts.clientsWhoStoppedTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsWhoMissedAppointmentsDied() {
		return cohortIndicator("% of clients who missed appointments who died",
		    map(crossborderCohorts.clientsWhoMissedAppointmentsDied(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbLTFUselfTransferred() {
		return cohortIndicator("%  of LTFU who self-transferred",
		    map(crossborderCohorts.LTFUselfTransferred(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbReportedAsStopedCurrentlyOnTreatment() {
		return cohortIndicator(
		    "%  of clients reported as stopped who currently are on treatment in the facility (data error)",
		    map(crossborderCohorts.reportedAsStopedCurrentlyOnTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbLTFUstoppedTreatment() {
		return cohortIndicator("% of LTFU who Stopped Treatment",
		    map(crossborderCohorts.LTFUstoppedTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbLTFUdied() {
		return cohortIndicator("% of LTFU who died",
		    map(crossborderCohorts.LTFUdied(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbLTFUtraced() {
		return cohortIndicator("% of LTFU traced",
		    map(crossborderCohorts.LTFUtraced(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbLTFUrestartedArt() {
		return cohortIndicator("% of LTFU restarted ART",
		    map(crossborderCohorts.LTFUrestartedArt(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbNewOnTreatment() {
		return cohortIndicator("Number new on treatment",
		    map(crossborderCohorts.newOnTreatment(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTransferIn() {
		return cohortIndicator("Transfer In",
		    map(crossborderCohorts.transferIn(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbTransferOut() {
		return cohortIndicator("Transfer Out",
		    map(crossborderCohorts.transferOut(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbRecievedThreeMonthsSubscription() {
		return cohortIndicator(
		    "No. of patients who received 3 months prescription (for Stable clients attending clinic today)",
		    map(crossborderCohorts.recievedThreeMonthsSubscription(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsTransitionedToTLD() {
		return cohortIndicator("No. of clients transitioned to TLD",
		    map(crossborderCohorts.clientsTransitionedToTLD(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator cbClientsDueForViralLoad() {
		return cohortIndicator("No. of clients due for viral load (from clients attending clinic today)",
		    map(crossborderCohorts.clientsDueForViralLoad(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
	}
	
	public CohortIndicator VLsamplesCollectedFromClientsAttendingClinic() {
		return cohortIndicator(
		    "No. of VL samples collected from clients attending clinic",
		    map(crossborderCohorts.VLsamplesCollectedFromClientsAttendingClinic(),
		        "onOrAfter=${startDate},onOrBefore=${endDate}"));
		
	}
	
	public CohortIndicator VLresultsRecieved() {
		return cohortIndicator("No. of VL results received",
		    map(crossborderCohorts.VLresultsRecieved(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
		
	}
	
	public CohortIndicator VLresultsSuppressed() {
		return cohortIndicator("No. of VL suppressed",
		    map(crossborderCohorts.VLresultsSuppressed(), "onOrAfter=${startDate},onOrBefore=${endDate}"));
		
	}
}
