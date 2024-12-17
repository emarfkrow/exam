/**
 * 従妹グリッド定義
 */

let Tb1ItokoGridColumns = [
    Column.comma('ITOKO_ID', Messages['Tb1ItokoGrid.itokoId'], 80, 'primaryKey numbering', null),
    Column.text('ITOKO_MEI', Messages['Tb1ItokoGrid.itokoMei'], 300, '', null),
    Column.refer('SOSEN_ID', Messages['Tb1ItokoGrid.sosenId'], 80, '', 'null'),
    Column.comma('OYA_BN', Messages['Tb1ItokoGrid.oyaBn'], 80, '', null),
    Column.comma('ENTITY_BN', Messages['Tb1ItokoGrid.entityBn'], 80, '', null),
    Column.cell('INSERT_DT', Messages['Tb1ItokoGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1ItokoGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1ItokoGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1ItokoGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1ItokoGrid.deleteF'], 30, ''),
];
