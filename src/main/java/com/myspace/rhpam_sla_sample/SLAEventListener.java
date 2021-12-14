package com.myspace.rhpam_sla_sample;

import org.kie.api.event.process.DefaultProcessEventListener;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.SLAViolatedEvent;

public class SLAEventListener extends DefaultProcessEventListener {

    public void afterProcessStarted(ProcessStartedEvent event) {
        System.out.println("Process Started: Event listener fired");
    }

    public void afterSLAViolated(SLAViolatedEvent event) {
        System.out.println("afterSLAViolated: Event listener fired");
        super.afterSLAViolated(event);
    }

    public void beforeSLAViolated(SLAViolatedEvent event) {
        System.out.println("beforeSLAViolated: Event listener fired");
        super.beforeSLAViolated(event);
    }
}
