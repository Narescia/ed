using NUnit.Framework;
using System;

namespace CBingo
{
	[TestFixture()]
	public class EspeakHelperTest
	{
		[Test()]
		public void ToEspeak ()
		{
			Assert.AreEqual ("'1'", EspeakHelper.ToEspeak (1));
		}
	}
}

