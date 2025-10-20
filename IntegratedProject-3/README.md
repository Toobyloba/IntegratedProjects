## **Question 3: Cross-Domain Integration**

You are developing a **microservices monitoring system** where ARM Cortex-M devices collect sensor data and transmit it via UART to a Java application running in a Docker container.

**Scenario:**

Your ARM assembly code uses the **SysTick Timer** to sample temperature data every 500ms from an ADC, stores the readings in a FIFO buffer, and transmits them via UART. The data format is: `TEMP:XXX\n` where XXX is a 3-digit decimal value.

The Java application should:
- Read UART data from a simulated serial port file (`/dev/ttyUSB0`)
- Parse temperature values using regex
- Store the last 10 readings in a LinkedList
- Calculate the average temperature using Java Stream API
- Log warnings if temperature exceeds 75°C

**Your Task:**

Write the **complete Java class** named `TemperatureMonitor` that implements this functionality. Include proper exception handling for file I/O and parsing errors.

**Requirements:**
- Use `BufferedReader` for efficient file reading
- Implement regex pattern matching for parsing
- Use `LinkedList<Integer>` with size limit of 10
- Calculate average using Stream API's `average()` method
- Handle `IOException` and `NumberFormatException` appropriately

***

**Provide your complete Java class implementation.**