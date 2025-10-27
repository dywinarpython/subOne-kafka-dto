package com.subOne.kafka_dto;

import com.subOne.notification.NotificationType;

public record KafkaDtoPaymentSubscription(Long subscriptionId, Long groupId, NotificationType notificationType) {
}
