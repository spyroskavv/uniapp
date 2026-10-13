-- Departments
INSERT INTO department (name) VALUES ('IT');
INSERT INTO department (name) VALUES ('Physics');
INSERT INTO department (name) VALUES ('Mathematics');

-- Professors
INSERT INTO professor (name, department_id) VALUES ('Prof. Roy Trenneman', 1);
INSERT INTO professor (name, department_id) VALUES ('Prof. Jen Barber', 1);
INSERT INTO professor (name, department_id) VALUES ('Prof. Maurice Moss', 1);

INSERT INTO professor (name, department_id) VALUES ('Prof. Albert Einstein', 2);
INSERT INTO professor (name, department_id) VALUES ('Prof. Isaac Newton', 2);
INSERT INTO professor (name, department_id) VALUES ('Prof. Marie Curie', 2);

INSERT INTO professor (name, department_id) VALUES ('Prof. Carl Gauss', 3);
INSERT INTO professor (name, department_id) VALUES ('Prof. Euclid', 3);
INSERT INTO professor (name, department_id) VALUES ('Prof. Emmy Noether', 3);

-- Courses
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Software Development', true, 20, 50, 1, 1);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Object Oriented Programming', true, 30, 60, 1, 2);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Computer Architecture', false, 10, 30, 1, 3);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Algorithms and Data Structures', true, 20, 40, 1, 1);

INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Introduction to Mechanics', true, 25, 40, 2, 4);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Astronomy', true, 30, 50, 2, 5);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Quantum Physics', false, 10, 25, 2, 6);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Theoretical Physics', false, 20, 30, 2, 4);

INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Algebra', true, 30, 60, 3, 7);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Information Theory', true, 20, 45, 3, 8);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Probability and Statistics', true, 15, 40, 3, 9);
INSERT INTO course (name, mandatory, credits, duration, department_id, professor_id) VALUES ('Dynamics', true, 20, 35, 3, 7);

-- Students
INSERT INTO student (name, personal_details, total_credits, total_hours, passing_semester) VALUES ('Test Student A', 'Details A', 0, 0, false);
INSERT INTO student (name, personal_details, total_credits, total_hours, passing_semester) VALUES ('Test Student B', 'Details B', 0, 0, false);
INSERT INTO student (name, personal_details, total_credits, total_hours, passing_semester) VALUES ('Test Student C', 'Details C', 0, 0, false);
