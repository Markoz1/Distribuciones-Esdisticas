/**
 * Distribucion-poisonController
 *
 * @description :: Server-side logic for managing distribucion-poisons
 * @help        :: See http://sailsjs.org/#!/documentation/concepts/Controllers
 */

module.exports = {

	create:function (req, res) {
		res.view('distribuciones/poison');
	}
};

