/**
 * 従妹グリッド定義
 */

let Tb1ItokoGridColumns = [
    Column.comma('ITOKO_ID', Messages['Tb1ItokoGrid.itokoId'], 80, 'primaryKey numbering', null),
    Column.text('ITOKO_MEI', Messages['Tb1ItokoGrid.itokoMei'], 300, '', null),
    Column.comma('SOSEN_ID', Messages['Tb1ItokoGrid.sosenId'], 80, 'notblank', null),
    Column.comma('OYA_BN', Messages['Tb1ItokoGrid.oyaBn'], 80, 'notblank', null),
    Column.comma('ENTITY_BN', Messages['Tb1ItokoGrid.entityBn'], 80, 'notblank', null),
    Column.check('DELETE_F', Messages['Tb1ItokoGrid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['Tb1ItokoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
