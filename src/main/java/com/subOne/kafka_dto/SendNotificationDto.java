package com.subOne.kafka_dto;

import com.subOne.notification.NotificationType;
import com.subOne.notification.NotificationTargetType;

public record SendNotificationDto(NotificationType notificationType, NotificationTargetType notificationTargetType, Long targetId) {
}
