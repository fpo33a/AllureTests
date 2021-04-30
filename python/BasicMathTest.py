# c:\frank\MathematicTest\python>c:\frank\Python37-32\Scripts\py.test.exe BasicMathTest.py --alluredir=c:\temp\allure
# c:\frank\MathematicTest\python>c:\frank\allure-2.7.0\bin\allure serve c:\temp\allure
import allure
import pytest

import BasicMath as bm

@allure.feature('Addition')
@allure.title("Test the add function")
@allure.description("Test if the add function is ok")
def test_add():
    if bm.add(4,2) == 6:
      assert True
    else:
      assert False


@allure.feature('Substraction')
@allure.title("Test the sub function")
@allure.description("Test if the sub function is ok")
def test_sub():
    if bm.sub(4,2) == 6:
      assert True
    else:
      assert False
