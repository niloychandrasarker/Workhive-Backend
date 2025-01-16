package com.niloy.service;

import com.niloy.modal.PlanType;
import com.niloy.modal.Subscription;
import com.niloy.modal.User;

public interface SubscriptionService {

    Subscription createSubscription(User user);

    Subscription getUsersSubscription(Long userId) throws Exception;

    Subscription upgradeSubscription(Long userId, PlanType planType) throws Exception;

    boolean isValid(Subscription subscription);

}
