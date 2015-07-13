package org.datavault.broker.services;

import org.datavault.common.model.Policy;
import org.datavault.common.model.dao.PolicyDAO;

import java.util.List;

public class PoliciesService {

    private PolicyDAO policyDAO;
    
    public List<Policy> getPolicies() {
        return policyDAO.list();
    }
    
    public void addPolicy(Policy policy) {
        policyDAO.save(policy);
    }
    
    public void updatePolicy(Policy policy) {
        policyDAO.update(policy);
    }
    
    public Policy getPolicy(String policyID) {
        return policyDAO.findById(policyID);
    }
    
    public void setPolicyDAO(PolicyDAO policyDAO) {
        this.policyDAO = policyDAO;
    }
}

