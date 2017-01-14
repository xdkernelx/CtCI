def calculate_angle(hours, minutes):
    # 360 degrees for a circle
    # 30 degrees / hour
    # 6 degrees / minute
    
    angle = (hours * 30) -  (minutes * 6)
    
    # If the hour is ahead of the 
    if (hours * 30) <  (minutes * 6):
        return angle
    else:
        angle = abs(angle);
        if angle > 180:
            angle  = 360 - angle
        return angle
    
    
print calculate_angle(9, 15)
print calculate_angle(3, 45)
print calculate_angle(3, 46)
print calculate_angle(0, 0)
print calculate_angle(12, 59)
print calculate_angle(1, 36)
print calculate_angle(0, 45)