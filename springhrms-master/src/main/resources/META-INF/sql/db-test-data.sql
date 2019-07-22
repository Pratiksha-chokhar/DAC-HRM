-- SET FOREIGN_KEY_CHECKS = 1;

USE hr;

INSERT INTO regions  (`region_id`,`region_name`) VALUES (
	1,
	'Europe'
	);

INSERT INTO regions  (`region_id`,`region_name`) VALUES (
	2,
	'Americas'
	);

INSERT INTO regions  (`region_id`,`region_name`) VALUES (
	3,
	'Asia'
	);

INSERT INTO regions  (`region_id`,`region_name`) VALUES (
	4,
	'Middle East and Africa'
	);

COMMIT;

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'IT',
	'Italy',
	1
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'JP',
	'Japan',
	3
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'US',
	'United States of America',
	2
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'CA',
	'Canada',
	2
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'CN',
	'China',
	3
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'IN',
	'India',
	3
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'AU',
	'Australia',
	3
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'ZW',
	'Zimbabwe',
	4
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'SG',
	'Singapore',
	3
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'UK',
	'United Kingdom',
	1
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'FR',
	'France',
	1
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'DE',
	'Germany',
	1
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'ZM',
	'Zambia',
	4
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'EG',
	'Egypt',
	4
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'BR',
	'Brazil',
	2
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'CH',
	'Switzerland',
	1
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'NL',
	'Netherlands',
	1
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'MX',
	'Mexico',
	2
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'KW',
	'Kuwait',
	4
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'IL',
	'Israel',
	4
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'DK',
	'Denmark',
	1
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'HK',
	'HongKong',
	3
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'NG',
	'Nigeria',
	4
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'AR',
	'Argentina',
	2
	);

INSERT INTO countries (`country_id`,`country_name`,`region_id`) VALUES (
	'BE',
	'Belgium',
	1
	);

COMMIT;

INSERT INTO locations (`location_id`, `city`, `postal_code`, `state_province`, `street_address`, `country_id`) VALUES (
	1400,
	'2014 Jabberwocky Rd',
	'26192',
	'Southlake',
	'Texas',
	'US'
	);

INSERT INTO locations (`location_id`, `city`, `postal_code`, `state_province`, `street_address`, `country_id`) VALUES (
	1500,
	'2011 Interiors Blvd',
	'99236',
	'South San Francisco',
	'California',
	'US'
	);

	
INSERT INTO locations (`location_id`, `city`, `postal_code`, `state_province`, `street_address`, `country_id`) VALUES (
	1700,
	'2004 Charade Rd',
	'98199',
	'Seattle',
	'Washington',
	'US'
	);

INSERT INTO locations (`location_id`, `city`, `postal_code`, `state_province`, `street_address`, `country_id`) VALUES (
	1800,
	'147 Spadina Ave',
	'M5V 2L7',
	'Toronto',
	'Ontario',
	'CA'
	);


INSERT INTO locations (`location_id`, `city`, `postal_code`, `state_province`, `street_address`, `country_id`) VALUES (
	2100,
	'1298 Vileparle (E)',
	'490231',
	'Bombay',
	'Maharashtra',
	'IN'
	);

INSERT INTO locations (`location_id`, `city`, `postal_code`, `state_province`, `street_address`, `country_id`) VALUES (
	2400,
	'8204 Arthur St',
	NULL,
	'London',
	NULL,
	'UK'
	);

INSERT INTO locations (`location_id`, `city`, `postal_code`, `state_province`, `street_address`, `country_id`) VALUES (
	2500,
	'Magdalen Centre, The Oxford Science Park',
	'OX9 9ZB',
	'Oxford',
	'Oxford',
	'UK'
	);


INSERT INTO locations (`location_id`, `city`, `postal_code`, `state_province`, `street_address`, `country_id`) VALUES (
	2700,
	'Schwanthalerstr. 7031',
	'80925',
	'Munich',
	'Bavaria',
	'DE'
	);


COMMIT;

-- SET FOREIGN_KEY_CHECKS = 0;


INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	10,
	'Administration',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	20,
	'Marketing',
	1800
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	30,
	'Purchasing',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	40,
	'Human Resources',
	2400
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	50,
	'Shipping',
	1500
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	60,
	'IT',
	1400
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	70,
	'Public Relations',
	2700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	80,
	'Sales',
	2500
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	90,
	'Executive',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	100,
	'Finance',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	110,
	'Accounting',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	120,
	'Treasury',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	130,
	'Corporate Tax',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	140,
	'Control And Credit',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	150,
	'Shareholder Services',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	160,
	'Benefits',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	170,
	'Manufacturing',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	180,
	'Construction',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	190,
	'Contracting',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	200,
	'Operations',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	210,
	'IT Support',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	220,
	'NOC',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	230,
	'IT Helpdesk',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	240,
	'Government Sales',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	250,
	'Retail Sales',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	260,
	'Recruiting',
	1700
	);

INSERT INTO departments (`department_id`, `department_name`, `location_id`) VALUES (
	270,
	'Payroll',
	1700
	);


COMMIT;

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'AD_PRES',
	'President',
	20000,
	40000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'AD_VP',
	'Administration Vice President',
	15000,
	30000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'AD_ASST',
	'Administration Assistant',
	3000,
	6000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'FI_MGR',
	'Finance Manager',
	8200,
	16000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'FI_ACCOUNT',
	'Accountant',
	4200,
	9000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'AC_MGR',
	'Accounting Manager',
	8200,
	16000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'AC_ACCOUNT',
	'Public Accountant',
	4200,
	9000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'SA_MAN',
	'Sales Manager',
	10000,
	20000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'SA_REP',
	'Sales Representative',
	6000,
	12000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'PU_MAN',
	'Purchasing Manager',
	8000,
	15000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'PU_CLERK',
	'Purchasing Clerk',
	2500,
	5500
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'ST_MAN',
	'Stock Manager',
	5500,
	8500
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'ST_CLERK',
	'Stock Clerk',
	2000,
	5000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'SH_CLERK',
	'Shipping Clerk',
	2500,
	5500
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'IT_PROG',
	'Programmer',
	4000,
	10000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'MK_MAN',
	'Marketing Manager',
	9000,
	15000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'MK_REP',
	'Marketing Representative',
	4000,
	9000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'HR_REP',
	'Human Resources Representative',
	4000,
	9000
	);

INSERT INTO jobs (`job_id`,`job_title`,`max_salary`,`min_salary`) VALUES (
	'PR_REP',
	'Public Relations Representative',
	4500,
	10500
	);

COMMIT;

INSERT INTO employees (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `hire_date`,`job_id`, `salary`,`commission_pct`,`manager_id`,`department_id`) VALUES(
	1,
	'Steven',
	'King',
	'SKING',
	'515.123.4567',
	STR_TO_DATE('17-JUN-1987', '%d-%M-%Y'),
	'AD_PRES',
	24000,
	'100.00',
	NULL,
	90
	);

INSERT INTO employees (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `hire_date`,`job_id`, `salary`,`commission_pct`,`manager_id`,`department_id`) VALUES(
	2,
	'Neena',
	'Kochhar',
	'NKOCHHAR',
	'515.123.4568',
	STR_TO_DATE('21-SEP-1989', '%d-%M-%Y'),
	'AD_VP',
	17000,
	'100.00',
	1,
	90
	);

INSERT INTO employees (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `hire_date`,`job_id`, `salary`,`commission_pct`,`manager_id`,`department_id`) VALUES(
	3,
	'Lex',
	'De Haan',
	'LDEHAAN',
	'515.123.4569',
	STR_TO_DATE('13-JAN-1993', '%d-%M-%Y'),
	'AD_VP',
	17000,
	'100.00',
	1,
	90
	);

INSERT INTO employees (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `hire_date`,`job_id`, `salary`,`commission_pct`,`manager_id`,`department_id`) VALUES(
	4,
	'Alexander',
	'Hunold',
	'AHUNOLD',
	'590.423.4567',
	STR_TO_DATE('03-JAN-1990', '%d-%M-%Y'),
	'IT_PROG',
	9000,
	'100.00',
	3,
	60
	);

INSERT INTO users(username,password,enabled)
VALUES ('admin','$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y', true);
INSERT INTO users(username,password,enabled)
VALUES ('manish','$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y', true);

INSERT INTO user_roles (username, role)
VALUES ('admin', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role)
VALUES ('manish', 'ROLE_USER');	

COMMIT;