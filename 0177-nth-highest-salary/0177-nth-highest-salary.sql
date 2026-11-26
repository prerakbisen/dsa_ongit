CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    --  set N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      
        WITH high_sal AS (
            SELECT
            salary,
            DENSE_RANK() OVER (
            ORDER BY salary DESC
        ) AS rnk
    FROM employee
    )
    SELECT salary
    FROM high_sal
    WHERE rnk =N
    limit 1

    
  );
END