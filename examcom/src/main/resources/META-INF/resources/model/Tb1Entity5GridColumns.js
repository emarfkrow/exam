/**
 * エンティティ５グリッド定義
 */

let Tb1Entity5GridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1Entity5Grid.sosenId'], 80, 'primaryKey numbering', null),
    Column.comma('OYA_BN', Messages['Tb1Entity5Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity5Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY5_MEI', Messages['Tb1Entity5Grid.entity5Mei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Tb1Entity5Grid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['Tb1Entity5Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
